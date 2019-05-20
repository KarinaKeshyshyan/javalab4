package ua.lviv.iot.weavingMachines.manager;

import ua.lviv.iot.weavingMachines.models.MaterialType;
import ua.lviv.iot.weavingMachines.models.WeavingMachines;

import java.util.LinkedList;
import java.util.List;

public interface MachineManager {
    List<WeavingMachines> weavingMachines = new LinkedList<>();

    List<WeavingMachines> findByMaterial(MaterialType materialType);
    List<WeavingMachines> findByWidth(double width);
    List<WeavingMachines> sortByVolume(
            List<WeavingMachines> weavingMachines, boolean reverse);
    List<WeavingMachines> sortByPower(
            List<WeavingMachines> weavingMachines, boolean reverse);
}
