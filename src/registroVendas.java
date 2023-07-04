public class registroVendas {
     
String Vendedor = "Josicleiton" ;
String Produto = "Carro";
double valorProd = 70000.00;
double totalVendas = 0;
double Salario = 15000.00;



public void totalVendido( int nVendas) {
    totalVendas =  nVendas * valorProd;
}


public void salarioatt() {
    Salario = totalVendas * 0.15 + Salario; 
}

}
