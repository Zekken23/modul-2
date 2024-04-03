package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

//ShootAb -> ShootAble
public class Tank extends Kendaraan implements ShootAble{
    @Override
    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
