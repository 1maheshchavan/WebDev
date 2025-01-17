package com.example.therapyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class TherapyApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TherapyApiApplication.class, args);
    }
}

@RestController
@RequestMapping("/clients")
class ClientController {

    private final Map<String, Client> clients = new HashMap<>();

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        client.setClientId(UUID.randomUUID().toString());
        clients.put(client.getClientId(), client);
        return client;
    }

    @GetMapping
    public List<Client> listClients() {
        return new ArrayList<>(clients.values());
    }

    @GetMapping("/{clientId}")
    public Client getClient(@PathVariable String clientId) {
        return clients.get(clientId);
    }

    @PutMapping("/{clientId}")
    public Client updateClient(@PathVariable String clientId, @RequestBody Client updatedClient) {
        Client client = clients.get(clientId);
        if (client != null) {
            client.setName(updatedClient.getName());
            client.setEmail(updatedClient.getEmail());
            client.setPhone(updatedClient.getPhone());
        }
        return client;
    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable String clientId) {
        clients.remove(clientId);
    }
}

@RestController
@RequestMapping("/therapists")
class TherapistController {

    private final Map<String, Therapist> therapists = new HashMap<>();

    @PostMapping
    public Therapist createTherapist(@RequestBody Therapist therapist) {
        therapist.setTherapistId(UUID.randomUUID().toString());
        therapists.put(therapist.getTherapistId(), therapist);
        return therapist;
    }

    @GetMapping
    public List<Therapist> listTherapists() {
        return new ArrayList<>(therapists.values());
    }

    @GetMapping("/{therapistId}")
    public Therapist getTherapist(@PathVariable String therapistId) {
        return therapists.get(therapistId);
    }

    @PutMapping("/{therapistId}")
    public Therapist updateTherapist(@PathVariable String therapistId, @RequestBody Therapist updatedTherapist) {
        Therapist therapist = therapists.get(therapistId);
        if (therapist != null) {
            therapist.setName(updatedTherapist.getName());
            therapist.setSpecialization(updatedTherapist.getSpecialization());
        }
        return therapist;
    }

    @DeleteMapping("/{therapistId}")
    public void deleteTherapist(@PathVariable String therapistId) {
        therapists.remove(therapistId);
    }
}

class Client {
    private String clientId;
    private String name;
    private String email;
    private String phone;

    // Getters and Setters

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Therapist {
    private String therapistId;
    private String name;
    private String specialization;

    // Getters and Setters

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
