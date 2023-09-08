package lists;

import classes.*;

public class RegisterObjs {
    //médicos
    public static Medic medic01 = new Medic("Hans Chucrute", 50, 170,98.f, "Masculino", "111.222.333-45", 5000.f, 143569);
    public static Medic medic02 = new Medic("Luiz Celso", 64, 180,86.f, "Masculino", "121.333.444-48", 5000.f, 245569);
    public static Medic medic03 = new Medic("Marilia Lindel", 38, 168,59.f, "Feminino", "867.453.444-45", 5000.f, 654569);

    //veterinários
    public static Veterinary vet01 = new Veterinary("Maria Anna", 27, 170,64.f, "Feminino", "987.222.432-42", 5000.f, 165333);
    public static Veterinary vet02 = new Veterinary("José Maria Silva", 46, 175,89.f, "Masculino", "654.222.553-75", 5000.f, 187433);
    public static Veterinary vet03 = new Veterinary("Gabriela Maria", 25, 168,47.f, "Feminino", "234.555.756-23", 5000.f, 987443);

    //pacientes
    public static Patient pat01 = new Patient("Gabriela Jitter", 25, 168,47.f, "Feminino", "422.444.313-56", 113064, "CID J11. 8");
    public static Patient pat02 = new Patient("Aline Nascimento", 22, 164,38.f, "Feminino", "123.323.422-32", 113065, "CID D50.9");
    public static Patient pat03 = new Patient("João Marques", 32, 187,98.f, "Masculino", "928.736.232-41", 113066, "CID K80");

    //animais
    //Cachorros
    public static Dog dog01 = new Dog("Thor", 5, 55, 14.f,"Masculino", "Cinomose");
    public static Dog dog02 = new Dog("Saber", 2, 15, 4.f,"Feminino", "Dermatite canina");

    //gatos
    public static Cat cat01 = new Cat("Felix", 1, 15, 1.3f,"Masculino", "Leucemia felina");
    public static Cat cat02 = new Cat("Nina", 3, 15, 1.2f,"Feminino", "Pneumonite felina");
}
