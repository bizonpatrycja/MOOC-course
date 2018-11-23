European registration plates are composed of two parts: the country ID -- one or two letters long -- and possibly a regitration code specific for the country, which in turn is composed of numbers and letters.

We want to store the registration plates into say ArrayLists, using a HashMap as key. As mentioned before, it means we have to implement the methods equals and hashCode in their class, otherwise they can't work as we want. 

Implement the class VehicleRegister with the following functions:

- public boolean add(RegistrationPlate plate, String owner)
- public String get(RegistrationPlate plate)
- public boolean delete(RegistrationPlate plate)
- public void printRegistrationPlates()
- public void printOwners()
