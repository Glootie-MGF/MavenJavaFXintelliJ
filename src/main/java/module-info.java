module es.damdi.marta {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens es.damdi.marta to javafx.fxml;
    exports es.damdi.marta;
}