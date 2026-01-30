package OOP;

public class OverridingMethod {
    //parent
    public class Card {
        public String MessageGreeting(){
            return " Wish you ";
        }
    }
    //child
    public class BrithdayCard extends Card{
        public String MessageGreeting(){
            return " wish you on your brithDay ";
        }
    }
    public class HolidayCard extends Card{
        @Override
        public String MessageGreeting(){
            return " wish you on your holiday ";
        }
    }
    public void main(String[] args){
        //create object card
        Card objCard = new Card();
        System.out.println("objCard.MessageGreeting() = " + objCard.MessageGreeting());
        System.out.println("==========================================================");
        //create brithdayCard
        BrithdayCard objBrithdayCard = new BrithdayCard();
        System.out.println("objBrithdayCard.MessageGreeting() = " + objBrithdayCard.MessageGreeting());
        System.out.println("==========================================================");
        HolidayCard objHoli = new HolidayCard();
        System.out.println( "objHoli.MessageGreeting = "+ objHoli.MessageGreeting());
    }
}
