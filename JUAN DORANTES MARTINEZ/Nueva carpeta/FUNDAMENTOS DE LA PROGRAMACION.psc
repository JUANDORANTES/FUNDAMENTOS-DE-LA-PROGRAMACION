Proceso NumeroMenorMayor
	Definir num1,num2,num3,mayor,menor como Real;
	num1<-0;
	num2<-0;
	num3<-0;
	mayor<-0;
	menor<-0;
	
	Escribir "Ingrese el primer número: ";
	Leer num1;
	
	Escribir "Ingrese el segundo número: ";
	Leer num2;
	
	Escribir "Ingrese el tercer número: ";
	Leer num3;
	
	Si num1>num2 y num1>num3 Entonces
		mayor<-num1;
	FinSi
	Si num2>num1 y num2>num3 Entonces
		mayor<-num2;
	FinSi
	Si num3>num1 y num3>num2 Entonces
		mayor<-num3;
	FinSi
	
	
	
	Si num1<num2 y num1<num3 Entonces
		menor<-num1;
	FinSi
	Si num2<num1 y num2<num3 Entonces
		menor<-num2;
	FinSi
	Si num3<num1 y num3<num2 Entonces
		menor<-num3;
	FinSi
	
	
	Escribir "El número mayor es ",mayor;
	Escribir "El número menor es ",menor;
	
	
	
FinProceso
