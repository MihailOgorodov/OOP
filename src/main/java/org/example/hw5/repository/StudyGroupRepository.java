package org.example.hw5.repository;

import org.example.hw5.model.StudyGroup;
import org.example.hw5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupRepository implements UserRepository<StudyGroup> {
    private final List<StudyGroup> studyGroups;

    public StudyGroupRepository() {
        this.studyGroups = new ArrayList<>();
    }

    @Override

    public List<StudyGroup> getAll() {
        return studyGroups;
    }

    @Override
    public void add(StudyGroup studyGroup) {
        studyGroups.add(studyGroup);
    }

    @Override
    public void remove(String fullName) {
        for (StudyGroup studyGroup : studyGroups) {
            if (studyGroup.getFullName().equals(fullName)) {
                studyGroups.remove(studyGroup);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (StudyGroup studyGroup : studyGroups) {
            if (studyGroup.getId() > maxId) {
                maxId = studyGroup.getId();
            }
        }
        return maxId;
    }
}
