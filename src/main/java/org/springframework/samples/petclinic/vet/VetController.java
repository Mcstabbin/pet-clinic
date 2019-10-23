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
package org.springframework.samples.petclinic.vet;

import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.samples.petclinic.visit.VisitRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;



import java.util.Map;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class VetController {

    private final VetRepository vets;
    private final VisitRepository visits;

    public VetController(VetRepository clinicService,VisitRepository visits) {
        this.vets = clinicService;
        this.visits = visits;
    }

    @GetMapping("/vets.html")
    public String showVetList(Map<String, Object> model) {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for Object-Xml mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        model.put("vets", vets);
        return "vets/vetList";
    }

    @GetMapping({ "/vets" })
    public @ResponseBody Vets showResourcesVetList() {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for JSon/Object mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        return vets;
    }

    @GetMapping("/vets/{vetId}")
    public String showVet(@PathVariable("vetId") int vetId, Map<String, Object> model) {
        Vet vet = new Vet();
        vet = vets.findById(vetId);
        model.put("vet", vet);
        return "vets/vetDetails";
    }

    @GetMapping("/vets/new")
    public String initNewVisitForm( Map<String, Object> model) {
        Vet vet = new Vet();
        model.put("vet", vet);
        return "vets/createOrUpdateVetForm";
    }


    @PostMapping("/vets/new")
    public String processCreationForm(@Valid Vet vet, BindingResult result, Map<String, Object> model) {
        if (result.hasErrors()) {
            return "vets/createOrUpdateVetForm";
        } else {
            this.vets.save(vet);

            Vets vets = new Vets();
            vets.getVetList().addAll(this.vets.findAll());
            model.put("vets", vets);
            return "vets/vetList";
        }
    }





}
