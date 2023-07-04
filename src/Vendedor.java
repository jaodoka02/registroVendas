public class Vendedor {
    public static void main(String[] args) {
        registroVendas Vendas = new registroVendas();
        int vendido = 5 ;



        System.out.println("Vendedor " + Vendas.Vendedor );
        System.out.println("Salario padrão " + Vendas.Salario);
        Vendas.totalVendido(vendido);
        System.out.println("Valor arrecadado após vender "  + vendido  + " unidades " + Vendas.totalVendas);
        System.out.println("Salario com comissão ");
        Vendas.salarioatt();
        System.out.println("O salário com a comissão das vendas será de " + Vendas.Salario);
    }
}
