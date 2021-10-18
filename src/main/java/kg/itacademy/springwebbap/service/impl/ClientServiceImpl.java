package kg.itacademy.springwebbap.service.impl;

import kg.itacademy.springwebbap.entity.Client;
import kg.itacademy.springwebbap.repository.ClientRepository;
import kg.itacademy.springwebbap.service.ClientService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteById(Long id) {
        Client clientForDelete = getById(id);
        clientRepository.delete(clientForDelete);
        return clientForDelete;
    }
}
