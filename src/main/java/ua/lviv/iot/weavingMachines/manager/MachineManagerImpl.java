package ua.lviv.iot.weavingMachines.manager;

import ua.lviv.iot.weavingMachines.models.MaterialType;
import ua.lviv.iot.weavingMachines.models.WeavingMachines;

import java.util.*;
import java.util.stream.Collectors;

public class MachineManagerImpl implements MachineManager {

    private List<WeavingMachines> weavingMachines;

    public MachineManagerImpl(List<WeavingMachines> weavingMachines) {
        this.weavingMachines = weavingMachines;
    }

    @Override
    public List<WeavingMachines> findByMaterial(MaterialType materialType) {
        return weavingMachines.stream().
                filter(weavingMachines1 -> (weavingMachines1.
                getKindOfMaterial() == materialType)).
                collect(Collectors.toList());
    }

    @Override
    public List<WeavingMachines> findByWidth(double width) {
        List<WeavingMachines> result = new LinkedList<>();
        weavingMachines.stream().
                filter(weavingMachines1 -> (weavingMachines1.
                        getWidth() == width)).
                forEach(weavingMachines1 -> result.add(weavingMachines1));
        return result;
    }

    @Override
    public List<WeavingMachines> sortByVolume(List<WeavingMachines> weavingMachines, boolean reverse) {
        if(reverse) {
            Collections.sort(weavingMachines,

                    Comparator.comparing(WeavingMachines::getVolume));
        }
        else {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getVolume).reversed());
        }
        return weavingMachines;
    }

    @Override
    public List<WeavingMachines> sortByPower(List<WeavingMachines> weavingMachines, boolean reverse) {
        if(reverse) {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getPower));
        }
        else {
            Collections.sort(weavingMachines, Comparator.comparing(WeavingMachines::getPower).reversed());
        }
        return weavingMachines;
    }
}
