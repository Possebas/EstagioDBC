public class ExercitoQueAtaca extends Exercito
{
   private EstrategiasDeAtaque estrategia;
   
   public ExercitoQueAtaca(EstrategiasDeAtaque estrategia)
   {
       this.estrategia = estrategia;  
   }
   
   public void trocarEstrategia(EstrategiasDeAtaque estrategia)
   {
       this.estrategia = estrategia;
   }
}