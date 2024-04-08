package com.example.furniturelailieva.ui.kitchen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniturelailieva.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.furniturelailieva.databinding.FragmentBedRoomBinding;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.furniturelailieva.MAdapter;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentKitchenBinding;
import com.example.furniturelailieva.models.FurnitureModel;
import java.util.ArrayList;
import java.util.List;


public class KitchenFragment extends Fragment {
    private FragmentKitchenBinding binding;
    List<FurnitureModel> list_kitchen = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kitchen);
        binding.rvKitchen.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_kitchen.add(new FurnitureModel("kitchen","PIANO ALLEGRO", "29000",
                "PIANO ALLEGRO - элегантная кухня в стиле арт-деко, привлекающая внимание оригинальной фрезеровкой фасадов. Кухонный гарнитур визуально расширяет пространство благодаря светлым тонам, полированным золотым вставкам и блеску глянцевых поверхностей.," +
                        "  Представленное стилистическое решение выгодно смотрится как в классических, так и в современных интерьерах.", R.drawable.pianoallegro));
        list_kitchen.add(new FurnitureModel("kitchen","GRANDE GOLD", "1100",
                " слияние дизайна и материала - фантастическая комбинация. Акцентные высокоглянцевые фасады из натурального шпона ценных пород дерева задающие тон всему помещению уравновешены эмалевыми фасадами в благородном цвете айвори. Золотой GOLA профиль подчеркивает строгую роскошь кухонного гарнитура. GRANDE GOLD - стильная эргономичная кухня.\n" +
                        "\n"
                , R.drawable.kuhnya1));
        list_kitchen.add(new FurnitureModel("kitchen","Стул Одар-1 Textile Grey", "10 990руб.\n",
                " Простые и лаконичные формы, четкие линии и компактный размер позволяют стулу хорошо смотреться на кухне, в отдельной столовой или помещении кафе. Практичные материалы не боятся влаги и загрязнений, которых не избежать в обеденной зоне. Ножки оснащены едва заметными накладками, защищающими пол от царапин. Благодаря эргономичной конструкции, стул очень удобен – спинка отклонена назад, а сиденье находится на оптимальной высоте от пола. В нашем каталоге представлены разные цветовые решения, чтобы вы могли подобрать комплект к любой интерьерной гамме."
                , R.drawable.kuhnya2));
        list_kitchen.add(new FurnitureModel("kitchen","Стул полубарный Уфо Black", "11 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "54 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "55 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "83 см\n" +
                        "Материал опор: металл\n" +
                        "Материал каркаса: металл, экокожа\n" +
                        "Максимальная нагрузка: 120 кг"
                , R.drawable.kuhnya));
        list_kitchen.add(new FurnitureModel("kitchen","Стол барный Бервин Beige", "15 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "130 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "60 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "105 см\n" +
                        "Материал опор: металл\n" +
                        "Материал столешницы: массив березы\n" +
                        "Опоры:Черный\n" +
                        "Цвет столешницы:Light beige", R.drawable.kuhnya3));
        list_kitchen.add(new FurnitureModel("kitchen","Кухонный стол Лори Marble", "37 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "120 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "120 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "77 см\n" +
                        "Материал столешницы: МДФ 18 мм\n" +
                        "Материал опор: МДФ\n" +
                        "Механизм: нет\n" +
                        "Вариант доставки: в разобранном виде\n" +
                        "Цвет: белый\n" +
                        "Цвет столешницы:Белый Мрамор\n" +
                        "Опоры:Белый"
                , R.drawable.kuhnya4));
        list_kitchen.add(new FurnitureModel("kitchen","Кухонный стол Эймс-100-1 White", "11 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "100 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "75 см\n" +
                        "Материал столешницы: МДФ 15 мм\n" +
                        "Материал опор: массив бука, металл\n" +
                        "Механизм: нет\n" +
                        "Вариант доставки: в разобранном виде\n" +
                        "Цвет: белый\n" +
                        "Цвет столешницы:Белый\n" +
                        "Опоры:Натуральный"
                , R.drawable.kuhnya5));
        list_kitchen.add(new FurnitureModel("kitchen","Кухонный гарнитур угловой Грейс", "492 600 Р",
                "Основные характеристики:\n" +
                        "Размеры, мм\t1500х3350х2200\n" +
                        "Цветовое исполнение\tОникс / Кубанит / Дуб Галифакс натуральный\n" +
                        "Материал корпуса\tЛДСП\n" +
                        "Материал фасада\tМДФ / Стекло\n" +
                        "Декор на фасаде\tДа\n" +
                        "Коллекция\tГрейс\n" +
                        "Срок гарантии, лет\t8"
                , R.drawable.kuhnya6));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kitchenFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}