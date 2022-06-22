from car import Automobile

if __name__ == "__main__":
    print("Hello Bitch!")

    Auto1 = Automobile()
    Auto2 = Automobile()

    Auto1.id = 11296891
    Auto1.license = "XOG162"
    Auto1.driver = "Armando Almarales"
    Auto1.Passenger = 4

    Auto2.id = 95830022
    Auto2.license = "AOR405"
    Auto2.driver = "Armando Jr"
    Auto2.Passenger = 4

    print(vars(Auto1))  
    print(vars(Auto2))