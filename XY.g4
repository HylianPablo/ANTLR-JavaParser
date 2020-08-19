grammar XY;

line
 :  x line? EOF
 |  y line? EOF
 ;

x
 :  X {System.out.println("X");}
 ;

y
 :  Y {System.out.println("Y");}
 ;

X
 :  'x'+
 ;

Y
 :  'y'+
 ;

SPACE
 : [ \t\r\n] -> skip
 ;