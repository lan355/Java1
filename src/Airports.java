import java.util.ArrayList;


public class Airports {

    public ArrayList<Airport> passengers;

    public Airports()
    {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Airport airport)
    {
        passengers.add(airport);
    }

    public String ShowMassOver30()
    {
        final StringBuilder mass = new StringBuilder();
        for (int i = 0; i < passengers.size();i++)
        {
            if(passengers.get(i).getSummWeightOfBag() > 30)
            {
                mass.append(i+1).append(") ").append(passengers.get(i).toString()).append("\n");
            }
        }
        return mass.toString();
    }
    public String summWeightOfBag()
    {
        final StringBuilder mass = new StringBuilder();
        for (int i = 0; i < passengers.size();i++)
        {
            mass.append(i+1).append(" ) Пассажиры ").append(passengers.get(i).getSummWeightOfBag()).append("\n");
        }
        return mass.toString();
    }
    public String numberOfBag(final String numberBag)
    {
        String mass = null;
        for (final Airport airport: passengers)
        {
            if(airport.getNumberBag().equals(numberBag))
            {
                mass = "Номер багажной квитанции пассажира:" + airport.getNumberFlight();
            }else {
                mass = "Номер багажной квитанции пассажира не найдена";
            }
        }
        return mass.toString();
    }
    public Airport removeLastName(final String lastname)
    {
        int numberOfPassenger;
        Airport airport = null;
        for (numberOfPassenger = 0; numberOfPassenger < passengers.size(); numberOfPassenger++)
        {
            if(passengers.get(numberOfPassenger).getLastname().equals(lastname))
            {
                airport = passengers.get(numberOfPassenger);
                passengers.remove(numberOfPassenger);
                break;
            }
        }
        return airport;
    }

    public int Size() {
        return passengers.size();
    }
}
