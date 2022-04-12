public class Main {


    public static void Liking(String Sentence){

        String mySentnece =Sentence.toLowerCase();

        String mySentiments="Affection,Adoration,Fondness,Liking, Attraction, Caring, Tenderness,Compassion,Sentimentality,Lust/Sexual desire, Desire, Passion, Infatuation, Longing, lovely, excellent, good, loved, adore, best, perfect, love, magnific, yummy, love";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentnece,sentiments);


        System.out.println("LIKING:"+stringContainsItemFromList(mySentnece,sentiments));


    }


    public static void Trust(String Sentence){

        String mySentnece =Sentence.toLowerCase();

        String mySentiments="Trust, comfortable, encouraging, marvelous, kudos, thankful, perfect";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentnece,sentiments);


        System.out.println("TRUST:"+stringContainsItemFromList(mySentnece,sentiments));


    }



    public static void Joy(String Sentence){

        String mySentnece =Sentence.toLowerCase();

        String mySentiments="Excellent, Wonderful, Cheerfulness, Amusement, Bliss, Gaiety, Glee, Jolliness,Joviality, Joy, Delight, Enjoyment, Gladness, Happiness, Jubilation, Elation,Satisfaction, Ecstasy, Euphoria, Zest, Enthusiasm, Zeal, Excitement, Thrill, Exhilaration, Contentment, Pleasure, Pride, Triumph, Optimism, Eagerness, Hope, Enthrallment, Rapture, Relief, beautiful, enjoy, super, excellent, fantastic, superb, free, wonderful, happy, brilliant, perfect, success, appreciate, delightful, divine, gracious, winning, lmfao ";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentnece,sentiments);


        System.out.println("JOY:"+stringContainsItemFromList(mySentnece,sentiments));


    }

    public static void Surprise(String Sentence){

        String mySentence =Sentence.toLowerCase();

        String mySentiments="Surprise, Amazement, Astonishment, awesome, great, super, amazing, outstanding, fascinating";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentence,sentiments);


        System.out.println("SURPRISE:"+stringContainsItemFromList(mySentence,sentiments));


    }

    public static void Anger(String Sentence){

        String mySentence =Sentence.toLowerCase();

        String mySentiments="Irritability, Aggravation, Agitation, Annoyance, Grumpy, Crosspatch,Exasperation, Frustration, Rage, Anger, Outrage, Fury, Wrath, Hostility, Ferocity, Bitterness, Hatred, Scorn, Spite, Vengefulness, Dislike, Resentment, Disgust, Revulsion, Contempt, Loathing, Envy, Jealousy, Torment, idiot, sucker, loser, dumbass, hate, anger";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentence,sentiments);


        System.out.println("ANGER:"+stringContainsItemFromList(mySentence,sentiments));


    }

    public static void Sadness(String Sentence){

        String mySentence =Sentence.toLowerCase();

        String mySentiments="Suffering, pain, sucker, Agony, Anguish,Hurt,Sadness, Depression, Despair, Gloom, Glumness, Unhappiness, Grief, Sorrow, Woe, Misery, Melancholy, Disappointment, Dismay, Displeasure, Shame, Guilt, Regret, Remorse, Neglect, Alienation, Defeatism, Dejection, Embarrassment, Homesickness, Humiliation, Insecurity, insult, Isolation, Loneliness, Rejection, Sympathy, Pity, Sympathy, loser, unhealthy, ruin, hurt, sick, sadness";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentence,sentiments);


        System.out.println("SADNESS:"+stringContainsItemFromList(mySentence,sentiments));


    }

    public static void Fear(String Sentence){

        String mySentence =Sentence.toLowerCase();

        String mySentiments="Horror, Alarm, Shock, Fear, Fright, Horror, Terror, Panic, Hysteria, Mortification, Nervousness, Anxiety, Suspense, Uneasiness, Apprehension, fear, Worry, Distress, Dread, danger, fraud, hell, painful, scam, stressful";
        String LowerSentiments=mySentiments.toLowerCase();

        String[] sentiments=LowerSentiments.split(",");
        stringContainsItemFromList(mySentence,sentiments);


        System.out.println("FEAR:"+stringContainsItemFromList(mySentence,sentiments));


    }




    public static boolean stringContainsItemFromList(String inputStr, String[] items) {
        return Arrays.stream(items).anyMatch(inputStr::contains);
    }


    public static void SentenceAnalyzer(String Sentence){

        System.out.println("This Sentence contains: ");

        Liking(Sentence);
        Trust(Sentence);
        Joy(Sentence);
        Surprise(Sentence);
        Anger(Sentence);
        Sadness(Sentence);
        Fear(Sentence);


    }

    public static void main(String[] args) {
   

       SentenceAnalyzer("this is an excellent application for learning programming love like dislike.");

    }
}





