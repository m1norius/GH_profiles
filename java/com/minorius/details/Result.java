package com.minorius.details;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;


@Component
@Profile(value = {"dev", "prod"})
public class Result {

    @SerializedName("car")
    @Expose
    private Car car;

    private String path;

    public Result(@Value("${path}") String path) {
        this.path = path;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Autowired
    public void createCar() throws FileNotFoundException {
        Gson gson = new Gson();
        Result[] example = gson.fromJson(new FileReader(path), Result[].class);
        if(example!=null){
            for (Result e : example){
                System.out.println("Model: "+e.getCar().getModel());
                System.out.println("Power: "+e.getCar().getEngine().getPower());
                System.out.println("Type: "+e.getCar().getEngine().getType());
                System.out.println("Capacity: "+e.getCar().getEngine().getCapacity());
                System.out.println("Tyres: "+e.getCar().getWheels().getName());
                System.out.println("-------------------------");
            }
        }
    }
}