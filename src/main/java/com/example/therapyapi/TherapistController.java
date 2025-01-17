package com.example.therapyapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

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
