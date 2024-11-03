package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location  location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
//            return System.lineSeparator();
        String jobName;
        if (this.getName().isEmpty()){
            jobName = "Data not available";
        } else {
            jobName = this.getName();
        }

        String jobEmployer;
        if (this.getEmployer().getValue().isEmpty()){
            jobEmployer = "Data not available";
        } else {
            jobEmployer = this.getEmployer().getValue();
        }

        String jobLocation;
        if (this.getLocation().getValue().isEmpty()){
            jobLocation = "Data not available";
        } else {
            jobLocation = this.getLocation().getValue();
        }

        String jobPositionType;
        if (this.getPositionType().getValue().isEmpty()){
            jobPositionType = "Data not available";
        } else {
            jobPositionType = this.getPositionType().getValue();
        }

        String jobCoreCompetency;
        if (this.getCoreCompetency().getValue().isEmpty()){
            jobCoreCompetency = "Data not available";
        } else {
            jobCoreCompetency = this.getCoreCompetency().getValue();
        }

        return (System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + jobName + System.lineSeparator() +
                "Employer: " + jobEmployer + System.lineSeparator() +
                "Location: " + jobLocation + System.lineSeparator() +
                "Position Type: " + jobPositionType + System.lineSeparator() +
                "Core Competency: " + jobCoreCompetency + System.lineSeparator());
    }
}