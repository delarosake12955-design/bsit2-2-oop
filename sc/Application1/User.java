package Application1;

public class User {

private String name;
private String planet = "Jupiter";


public String toString(){
    return getName() + " " + getPlanet() ;
}

public  boolean equals(User u2){
if(getName() == u2.getName() && getPlanet() == u2.getPlanet()){
 return true;

}
else {
    return false;
}
}

public User(){

}

public User (String name, String planet){
    setName(name);
    setPlanet(planet);
}


void setName(String name){

    this.name = name;

}

String getName(){
    return name;
}

void setPlanet(String planet){


    this.planet = planet;
}

void setPlanet(Planet planet){
    this.planet = planet.name();
}

public enum Planet{
    Mars, Earth, Jupiter
}

String getPlanet(){
    return planet;
}


}


