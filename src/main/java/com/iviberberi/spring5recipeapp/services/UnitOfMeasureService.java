package com.iviberberi.spring5recipeapp.services;

import com.iviberberi.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
