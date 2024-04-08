package com.example.furniturelailieva.ui.sale;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniturelailieva.MAdapter;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentSaleBinding;
import com.example.furniturelailieva.models.CategoryModel;
import com.example.furniturelailieva.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class SaleFragment extends Fragment {

    FragmentSaleBinding binding;
    NavController navController;
    List<FurnitureModel> list_s = new ArrayList<>();

    MAdapter adapter;

    public SaleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_s);
        binding.rvSale.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_s.add(new FurnitureModel("bed_room","Кровать Кевия 140", "62 990руб.+40%",
                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
                        " Материал корпуса: ДВП, ткань, фанера, ДСП\n" +
                        "Материал изголовья: ткань, мебельный щит\n" +
                        "Материал опор: пластик", R.drawable.bed));
        list_s.add(new FurnitureModel("children","Детская кровать Обри-1 80 Velvet Violet", "19 990руб.+15%\n",
                "Размеры\n" +
                        "Длина\n" +
                        "169 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "87 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "71 см,Материал корпуса: МДФ 16 мм, массив березы\n" +
                        "Материал каркаса: сращенный массив\n" +
                        "Материал изголовья: МДФ 16 мм, ткань, массив березы\n" +
                        "Материал опор: сращенный массив\n" +
                        "Основание кровати: реечное деревянное\n" +
                        "Подъемный механизм: без механизма\n" +
                        "Бельевой ящик: нет\n" +
                        "Ткань 1:Only 872 велюр\n" +
                        "Цвет корпуса:Натуральный\n" +
                        "Опоры:Натуральный"
                , R.drawable.child6));
        list_s.add(new FurnitureModel("Садовая мебель", "Кресло Либрет Beige\n", "24 990руб. +25%\n",
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
        list_s.add(new FurnitureModel("Садовая мебель", "Кресло подвесное Свинг Beige ", "3990руб.+10%",
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
        list_s.add(new FurnitureModel("kitchen","Кухонный гарнитур угловой Грейс", "492 600руб. +30%",
                "Основные характеристики:\n" +
                        "Размеры, мм\t1500х3350х2200\n" +
                        "Цветовое исполнение\tОникс / Кубанит / Дуб Галифакс натуральный\n" +
                        "Материал корпуса\tЛДСП\n" +
                        "Материал фасада\tМДФ / Стекло\n" +
                        "Декор на фасаде\tДа\n" +
                        "Коллекция\tГрейс\n" +
                        "Срок гарантии, лет\t8"
                , R.drawable.kuhnya6));
        list_s.add(new FurnitureModel("bed_room","Кровать Даймант-Floor 160", "47 990руб.+20%\n",
                "Размеры\n" +
                        "Длина\n" +
                        "217 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "214 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "112 см" +
                        "Материал корпуса: МДФ 16 мм, ДВП, ткань, фанера, ДСП, мебельный щит\n" +
                        "Материал изголовья: ткань, мебельный щит\n,Основание кровати: ортопедическое основание\n" +
                        "Ткань 1:Gesta Beige велюр"
                , R.drawable.bed5));
        list_s.add(new FurnitureModel("children","Распашной шкаф Арчи-2 Rose Irish", "36 490руб.+30%\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "52 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "196 см\n" +
                        "Вид петель:без доводчиков\nМатериал корпуса: ЛДСП 16 мм\n" +
                        "Материал фасада: МДФ 16 мм\n" +
                        "Ручки: Ручка массив ВТ 031 древесный D50\n" +
                        "Материал ручек: массив\n" +
                        "Материал опор: пластик\n" +
                        "Регулировка опор: да\n" +
                        "Цвет корпуса:Дуб Ирландский\n" +
                        "Цвет фасада:Роза SF-026 МДФ\n" +
                        "Цвет фасада 2:Чесура светлая МДФ\n" +
                        "Цвет задней стенки:Дуб Сонома ЛХДФ"
                , R.drawable.child3));
        list_s.add(new FurnitureModel("bed_room","Кровать Стелла 140 Дуб Сонома", "25 990руб.+20%\n" ,
                " Размеры\n" +
                        "Длина\n" +
                        "203 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "146 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "90 см" +
                        "Материал корпуса: ЛДСП 16 мм\n" +
                        "Материал изголовья: ЛДСП 16 мм\n" +
                        "Подъемный механизм: с механизмом\n" +
                        "Цвет корпуса:Дуб Сонома\n" +
                        "Цвет изголовья:Белая шагрень"
                , R.drawable.bed7));

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });

    }
}
