public enum Day {
    
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    Day(int day){
        this.day=day;
    }

    public int getDay(){
        return this.day;
    }
    public void getDayName(){
        String dayName=null;

        switch (this.getDay()){
            case 1:
                dayName="PAZARTESI";
                break;
            case 2:
                dayName="SALI";
                break;
            default:
        }
        System.out.println(dayName);
    }
}