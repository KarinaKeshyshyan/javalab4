package ua.lviv.iot.weavingMachines;

import ua.lviv.iot.weavingMachines.manager.MachineManager;
import ua.lviv.iot.weavingMachines.manager.MachineManagerImpl;
import ua.lviv.iot.weavingMachines.models.*.;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<WeavingMachines> weavingMachines = new LinkedList<>();
        weavingMachines.add(new DrillingMachine(12, MaterialType.ATLAS,
                55, ClassificationType.PARTIAL_DRILLING, 17, 81));
        weavingMachines.add(new LatheMachine(41, MaterialType.BATISTE, 37,
                ProcessingType.DRILL));
        weavingMachines.add(new LoomMachine(67, MaterialType.CASHMERE, 88,
                ManufacturingType.COTTON, 11));
        weavingMachines.add(new LoomMachine(77, MaterialType.ATLAS, 99,
                ManufacturingType.WOOL, 67));

        MachineManager machineManager = new MachineManagerImpl(weavingMachines);

        machineManager.findByMaterial(MaterialType.ATLAS);
        machineManager.findByWidth(12);
        machineManager.sortByPower(weavingMachines, true);
        machineManager.sortByVolume(weavingMachines, false);

    }
}
