package com.example.therapyapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

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
