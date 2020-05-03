package com.softaai.synerzipassignment.di

import com.softaai.synerzipassignment.viewmodel.MainViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel


val viewModelModule = module {

    viewModel { MainViewModel(get()) }
}