package engenhariasoftware;

	class Combo {
	    private Burguer burguer;
	    private Sobremesa sobremesa;
	    private Bebida bebida;

	    	    public void criarCombo(int tipo) {
	        if (tipo == 1) {
	            
	            burguer = new Burguer("Burguer Master", 36.00, 400);
	            sobremesa = new Sobremesa("Pudim", 18.00, "Pequeno");
	            bebida = new Bebida("Laranjada", 8.90, 350);
	        } else if (tipo == 2) {
	            
	            burguer = new Burguer("Super Burguer", 25.90, 100);
	            sobremesa = new Sobremesa("Sorvete", 15.50, "Medio");
	            bebida = new Bebida("Fanta uva", 5.99, 260);
	        } else {
	            System.out.println("Opção inexistente!");
	        }
	    }
	    @Override
	    public String toString() {
	        if (burguer != null && sobremesa != null && bebida != null) {
	            return "Combo:\n" + burguer + "\n" + sobremesa + "\n" + bebida + "\nTotal: R$ "
	                    + (burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco());
	        } else {
	            return "Erro!";
	        }
	    }
	}
