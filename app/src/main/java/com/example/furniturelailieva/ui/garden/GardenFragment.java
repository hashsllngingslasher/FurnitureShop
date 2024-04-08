package com.example.furniturelailieva.ui.garden;

import androidx.fragment.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniturelailieva.MAdapter;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentGardenBinding;
import com.example.furniturelailieva.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGardenBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvGarden.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Садовая мебель", "Кресло Либрет Beige\n", "24 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "70 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "70 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "40 см,Наполнение посадочного места: полиэфирное волокно\n" +
                        "Максимальная нагрузка: 120 кг\n" +
                        "Материал опор: сталь\n" +
                        "Основная:Beige Полиэстер", "20%",R.drawable.sad));
        list_g.add(new FurnitureModel("Садовая мебель", "Стол Тэкера-2 Black ", "13 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "72 см\n" +
                        "Просвет от пола: 66 см\n" +
                        "Материал столешницы: стекло, ротанг\n" +
                        "Толщина столешницы: 6 мм\n" +
                        "Материал опор: сталь\n" +
                        "Механизм: нет\n" +
                        "Цвет столешницы:Стекло\n" +
                        "Опоры:Черный", "60%",R.drawable.sad1));
        list_g.add(new FurnitureModel("Садовая мебель", "Кресло подвесное Свинг Beige ", "3990руб.",
                "Размеры\n" +
                        "Длина\n" +
                        "80 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "80 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "60 см\n" +
                        "Материал каркаса: металл\n" +
                        "Тип ткани: хлопок\n" +
                        "Максимальная нагрузка: 80 кг\n" +
                        "С навесом: нет\n" +
                        "Основная:Beige Хлопок", "10%",R.drawable.sad2));
        list_g.add(new FurnitureModel("Садовая мебель", "Шезлонг Ингрид", "15 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "195 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "70 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "52 см\n" +
                        "Материал каркаса: металл\n" +
                        "Механизм: фиксация наклона спинки в любом положении\n" +
                        "Максимальная нагрузка: 95 кг\n" +
                        "Подушка в комплекте: нет\n" +
                        "На колесиках: нет\n" +
                        "Цвет каркаса:Черный", "60%",R.drawable.sad3));
        list_g.add(new FurnitureModel("Садовая мебель", "Набор мебели Кендра Grey", "24 990руб.\n" ,
                "Материал каркаса: металл\n" +
                        "Вариант доставки: в разобранном виде\n" +
                        "Цвет каркаса:Серый\n" +
                        "Гарантия: 12 месяцев\n" +
                        "Цвет: серый\n" +
                        "Страна: Китай", "45%",R.drawable.sad5));
        list_g.add(new FurnitureModel("Садовая мебель", "Гамак Гравити", "2690руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "140 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "100 см\n" +
                        "Материал каркаса: массив дерева\n" +
                        "Тип ткани: хлопок\n" +
                        "Максимальная нагрузка: 100 кг\n" +
                        "С навесом: нет\n" +
                        "Основная:Beige Хлопок\n" +
                        "Цвет каркаса:Натуральный", "60%",R.drawable.sad4));
        list_g.add(new FurnitureModel("Садовая мебель", "Шезлонг Кэмп Grey", "4490руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "57 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "67 см\n" +
                        "Материал каркаса: ткань, термодерево\n" +
                        "Механизм: фиксация наклона спинки в любом положении\n" +
                        "Максимальная нагрузка: 120 кг\n" +
                        "Подушка в комплекте: нет\n" +
                        "На колесиках: нет\n" +
                        "Ткань 1:Oxford Grey полиэстер\n" +
                        "Цвет каркаса:Натуральный", "70%",R.drawable.sad6));
        list_g.add(new FurnitureModel("Садовая мебель", "Гамак Паола ", "4690руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "200 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "150 см\n" +
                        "Тип ткани: хлопок\n" +
                        "Максимальная нагрузка: 80 кг\n" +
                        "С навесом: нет\n" +
                        "Основная:Beige Хлопок", "60%",R.drawable.sad7));
    }
}