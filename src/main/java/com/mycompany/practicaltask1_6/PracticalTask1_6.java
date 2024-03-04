package com.mycompany.practicaltask1_6;

class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Gardener {
    public void filter(Plant plant) {
        String filteredName = plant.getName().replaceAll("[aeiouAEIOUаАеЕёЁиИоОуУыЫэЭюЮяЯ]", "");
        filteredName += "VGTBL";
        plant.setName(filteredName);
    }
}

