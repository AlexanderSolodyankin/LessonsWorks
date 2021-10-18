package kg.itacademy.springwebbap.service;

import kg.itacademy.springwebbap.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(Long id);
    Client saveClient(Client client);
    Client deleteById(Long id);
}
