/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.visit;

import java.time.LocalDate;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.owner.Pet;
/**
 * Simple JavaBean domain object representing a visit.
 *
 * @author Ken Krebs
 * @author Dave Syer
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "visit_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotEmpty
    @Column(name = "description")
    private String description;

    @Column(name = "time_id")
    private Integer timeId;

    @Column(name = "pet_id")
    private Integer petId;

    @Column(name = "vet_id")
    private Integer vetId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "time_id", insertable=false, updatable=false)
    private VisitTime visitTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pet_id", insertable=false, updatable=false)
    private Pet pet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vet_id", insertable=false, updatable=false)
    private Vet vet;

    /**
     * Creates a new instance of Visit for the current date
     */

    public VisitTime getVisitTime() {
        return this.visitTime;
    }

    public Visit() {
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getTimeId() {
        return this.timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vet getVet() {
        return this.vet;
    }

    public Pet getPet() {
        return this.pet;
    }

    public Integer getVetId() {
        return this.vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }

    public Integer getPetId() {
        return this.petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

}
