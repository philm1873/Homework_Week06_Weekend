package hotel;

import rooms.Bedroom;
import rooms.Conference;
import rooms.Suite;

import java.util.ArrayList;

public class Floor {
    int floorNumber;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Conference> conferenceRooms;
    ArrayList<Suite> suites;

    public Floor(int inputFloorNumber) {
        this.floorNumber = inputFloorNumber;
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        suites = new ArrayList<>();
    }

    public void addBedroom(Bedroom inputBedroom) {
        bedrooms.add(inputBedroom);
    }

    public void addConferenceRoom(Conference inputConference) {
        conferenceRooms.add(inputConference);
    }

    public void addSuite(Suite inputSuite) {
        suites.add(inputSuite);
    }

    public ArrayList<Conference> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<Suite> getSuites() {
        return suites;
    }
}
