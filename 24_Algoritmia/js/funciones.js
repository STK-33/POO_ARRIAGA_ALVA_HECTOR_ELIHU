//tarea prooblema 1
function problema1(){
	
    cadena = document.querySelector('#p1_input').value;
	var x = cadena.length;
	var cadenaInvertida = "";

	while (x>=0) {
		cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		x--;
	}
    document.querySelector('#p1_output').textContent = 
    'Lapalabra invertida es: ' + cadenaInvertida;
	return cadenaInvertida;
   
}


document.write("La cadena " + cadena + " invertida es " + invertir(cadena));
 
hacerfilas(texto, espacio );


//problema 2
function problema2(){

    /*
    para encontrar el minimo producto escalar entre 2 
    vectores tenemos que realizar
    las operaciones correspondientes con el maximo
    valor de un vector por el minimo valor 
    del otro vector, con esto
    encontraremos el minimo producto escalar
    */ 

    var p2_x1 = document.querySelector('#p2-x1').value;
    var p2_x2 = document.querySelector('#p2-x2').value;
    var p2_x3 = document.querySelector('#p2-x3').value;
    var p2_x4 = document.querySelector('#p2-x4').value;
    var p2_x5 = document.querySelector('#p2-x5').value;

    var p2_y1 = document.querySelector('#p2-y1').value;
    var p2_y2 = document.querySelector('#p2-y2').value;
    var p2_y3 = document.querySelector('#p2-y3').value;
    var p2_y4 = document.querySelector('#p2-y4').value;
    var p2_y5 = document.querySelector('#p2-y5').value;

    //construir el vector
    var v1 = [p2_x1, p2_x2, p2_x3, p2_x4, p2_x5];
    var v2 = [p2_y1, p2_y2, p2_y3, p2_y4, p2_y5];

    v1 = v1.sort(function(a, b){
        return b-a;
    });

    v2 = v2.sort(function(a, b){
        return b-a;
    });

    v2 = v2.reverse();

    var p2_producto = 0;

    for(var i = 0; i < v1.length; i++){
        p2_producto += v1[i]*v2[i];
    } 

    document.querySelector('#p2-output').textContent = 
    'Producto Escalar minimo ' + p2_producto;
}


function problema3(){
    textoArea = document.getElementById("p3_input").value;
    
    numeroCaracteres = textoArea.length - 1;
    inicioBlanco = /^ /
    finBlanco = / $/  
    variosBlancos = /[ ]+/g 
    textoArea = textoArea.replace(inicioBlanco,"");
    textoArea = textoArea.replace(finBlanco,"");
    textoArea = textoArea.replace(variosBlancos," ");  
    textoAreaDividido = textoArea.split(",");
    
    numeroPalabras = textoAreaDividido.length;
    tC = (numeroCaracteres==1)?" carácter":" caracteres";
    tP = (numeroPalabras==1)?" palabra":" palabras";
   
    var str= textoAreaDividido;
    var str1=[];
    for (var i=0;i<str.length;i++){
        var key=str[i];
        if(str.indexOf(key,i+1)==-1){
            str1.push(key);
        }
    }
    
   
    
    document.querySelector('#p3_output').textContent = 'El numero de palabras son:' + numeroPalabras
    +"\n"+ textoAreaDividido + ' = ' + numeroCaracteres +  ' ' + key;
   
}
 
