package estabelecimento;

import equipments.copiadora.Copiadora;
import equipments.digitalizadora.Digitalizadora;
import equipments.digitalizadora.Scanner;
import equipments.impressora.Deskjet;
import equipments.impressora.Impressora;
import equipments.impressora.Laserjet;
import equipments.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        digitalizadora.digitalizar();
        copiadora.copiar();
        impressora.imprimir();
    }
}
