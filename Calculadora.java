importar  java . texto . Formato Decimal ;
importar  java . . _ Scanner ;

public  class  Calculadora {
    public  static  void  principal ( String [] args ){
        Scanner  sc = novo  Scanner ( System . in );
        Sistema . fora . println ( "Digite um número maior que zero: " );
        float  valor1 = sc . nextFloat ();
        while ( valor1 <= 0 ) {
            Sistema . fora . println ( "Este número é menor que zero. Tente novamente!" );
            Sistema . fora . println ( "Digite um número maior que zero:" );
            valor1 = sc . nextFloat ();
        }

        Sistema . fora . println ( "Digite outro número maior que zero: " );
        float  valor2 = sc . nextFloat ();
        while ( valor2 <= 0 ) {
            Sistema . fora . println ( "Este número é menor que zero. Tente novamente!" );
            Sistema . fora . println ( "Digite um número maior que zero:" );
            valor2 = sc . nextFloat ();
        }

        Sistema . fora . println ( "Que operação você deseja realizar? \n Digite 1 para soma, 2 para subtração, 3 para divisão e 4 para multiplicação." );
        calcular ( sc , valor1 , valor2 );

    }
    public  static  void  calcular ( Scanner  sc , float  valor1 , float  valor2 ){
        int  operação = sc . proximoInt ();
        switch ( operação ){
            caso  1 :
                float  soma = valor1 + valor2 ;
                Sistema . fora . println ( "O valor da soma é " + new  DecimalFormat ( "#.##" ). format ( soma ));
                quebrar ;
            caso  2 :
                float  subtração = valor1 - valor2 ;
                Sistema . fora . println ( "O valor da subtração é " + new  DecimalFormat ( "#.##" ). format ( subtração ));
                quebrar ;
            caso  3 :
                float  divisão = valor1 / valor2 ;
                Sistema . fora . println ( "O valor da divisão é " + new  DecimalFormat ( "#.##" ). format ( divisão ));
                quebrar ;
            caso  4 :
                float  multiplicação = valor1 * valor2 ;
                Sistema . fora . println ( "O valor da multiplicação é :" + new  DecimalFormat ( "#.##" ). format ( multiplicacao ));
                quebrar ;
            padrão :
                Sistema . fora . println ( "Essa opção não é válida. Tente novamente uma opção entre 1 e 4:" );
                calcular ( sc , valor1 , valor2 );
        }
    }
}
