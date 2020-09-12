public class Airport {
   private String firstname, middlename,lastname;
   private String numberFlight,numberBag;
   SeatsBag numberOfSeatsBag;
   private int summWeightOfBag;

    public boolean CorrectText(String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            if(!Character.isAlphabetic(text.charAt(i)) && !(text.charAt(i) == '-') && !(text.charAt(i) == ' '))
                return false;
        }
        return true;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = CorrectText(firstname) ? firstname : "Неправильное имя";
    }
    public String getMiddlename()
    {
        return middlename;
    }

    public void setMiddlename(String middlename)
    {
        this.middlename = CorrectText(middlename) ? middlename : "Неправильная фамилия  ";
    }
    public String getNumberBag()
    {
        return numberBag;
    }

    public void setNumberBag(String numberBag)
    {
        this.numberBag = numberBag;
    }
    public String getNumberFlight()
    {
        return numberFlight;
    }

    public void setNumberFlight(String numberFlight)
    {
        this.numberFlight = numberFlight;
    }
    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = CorrectText(lastname) ? lastname : "Неправильное Отчество ";
    }
    public SeatsBag getNumberOfSeatsBag()
    {
        return getNumberOfSeatsBag();
    }

    public void setNumberOfSeatsBag(int number)
    {
        this.numberOfSeatsBag = (number > 0 && number <=2) ? SeatsBag.values()[number] : SeatsBag.Error;
    }
    public int getSummWeightOfBag()
    {
        return summWeightOfBag;
    }

    public void setSummWeightOfBag(int summWeightOfBag)
    {
        this.summWeightOfBag = summWeightOfBag > 0 ? summWeightOfBag : -1;
    }
    Airport()
    {
        this.firstname = "";
        this.middlename = "";
        this.lastname = "";
        this.numberFlight = "";
        this.numberBag = "";
        this.summWeightOfBag = 0;

    }

    public Airport(String firstname, String middlename, String lastname, String numberFlight, String numberBag, int numberOfSeatsBag, int summWeightOfBag)
    {
        this.setFirstname(firstname);
        this.setMiddlename(middlename);
        this.setLastname(lastname);
        this.setNumberFlight(numberFlight);
        this.setNumberBag(numberBag);
        this.setNumberOfSeatsBag(numberOfSeatsBag);
        this.setSummWeightOfBag(summWeightOfBag);
    }

    @Override
    public String toString() {
        return "Имя: " + firstname + "\n" + "Фамилия: " + middlename + "\n" + "Отчество: " + lastname + "\n" + "Номер рейса: " + numberFlight + "\n" + "Номер багажной квитанции: " + numberBag + "\n" + "Количество мест багажа пассажира: " + numberOfSeatsBag + "\n" + "Суммарный вес багажа: " + summWeightOfBag + "\n";

    }
}
