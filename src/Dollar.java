// src/Dollar.java
public class Dollar extends Money {
    
    // Construtor
    public Dollar(int amount) {
        super(amount);  // Chama o construtor da classe Money
    }

    // Sobrescreve o método times para retornar um novo objeto Dollar
    @Override
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
