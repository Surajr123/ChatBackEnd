package com.suraj.chat.repositories;


import com.suraj.chat.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    //get room using room id
    Room findByRoomId(String roomId);
}