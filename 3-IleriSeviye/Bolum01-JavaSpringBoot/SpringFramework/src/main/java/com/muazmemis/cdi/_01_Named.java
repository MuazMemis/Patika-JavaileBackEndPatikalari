package com.muazmemis.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

// cdi ==> Bean
@Named(value = "namedTutorial")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData = "Merhabalar Named Cdi Bean";
}
