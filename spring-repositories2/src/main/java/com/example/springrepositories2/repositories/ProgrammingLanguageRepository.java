package com.example.springrepositories2.repositories;

import com.example.springrepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Programming Language Repository"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
