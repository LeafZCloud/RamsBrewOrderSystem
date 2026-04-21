module edu.farmingdale.RamsBrewOrderSystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.RamsBrewOrderSystem to javafx.fxml;
    exports edu.farmingdale.RamsBrewOrderSystem;
    exports edu.farmingdale.RamsBrewOrderSystem.Drinks;
    opens edu.farmingdale.RamsBrewOrderSystem.Drinks to javafx.fxml;
    exports edu.farmingdale.RamsBrewOrderSystem.Factories;
    opens edu.farmingdale.RamsBrewOrderSystem.Factories to javafx.fxml;
    exports edu.farmingdale.RamsBrewOrderSystem.Builder;
    opens edu.farmingdale.RamsBrewOrderSystem.Builder to javafx.fxml;
}
