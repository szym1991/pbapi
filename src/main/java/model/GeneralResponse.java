package model;

import java.util.List;

/**
 * Push Bullet has interesting API response
 * I used only list of devices
 * TODO: Create class definitions for other lists
 */
public class GeneralResponse {
    private List<Object> accounts;
    private List<Object> blocks;
    private List<Object> channels;
    private List<Object> chats;
    private List<Object> clients;
    private List<Object> contacts;
    private List<Device> devices;
    private List<Object> grants;
    private List<Object> pushes;
    private List<Object> profiles;
    private List<Object> subscriptions;
    private List<Object> texts;

    public GeneralResponse() {
    }

    public List<Object> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Object> accounts) {
        this.accounts = accounts;
    }

    public List<Object> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Object> blocks) {
        this.blocks = blocks;
    }

    public List<Object> getChannels() {
        return channels;
    }

    public void setChannels(List<Object> channels) {
        this.channels = channels;
    }

    public List<Object> getChats() {
        return chats;
    }

    public void setChats(List<Object> chats) {
        this.chats = chats;
    }

    public List<Object> getClients() {
        return clients;
    }

    public void setClients(List<Object> clients) {
        this.clients = clients;
    }

    public List<Object> getContacts() {
        return contacts;
    }

    public void setContacts(List<Object> contacts) {
        this.contacts = contacts;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Object> getGrants() {
        return grants;
    }

    public void setGrants(List<Object> grants) {
        this.grants = grants;
    }

    public List<Object> getPushes() {
        return pushes;
    }

    public void setPushes(List<Object> pushes) {
        this.pushes = pushes;
    }

    public List<Object> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Object> profiles) {
        this.profiles = profiles;
    }

    public List<Object> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Object> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Object> getTexts() {
        return texts;
    }

    public void setTexts(List<Object> texts) {
        this.texts = texts;
    }
}
