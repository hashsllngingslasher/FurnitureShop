package com.example.furniturelailieva.ui.hallway;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.furniturelailieva.R;

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
import com.example.furniturelailieva.databinding.FragmentHallwayBinding;
import com.example.furniturelailieva.databinding.FragmentKitchenBinding;
import com.example.furniturelailieva.models.FurnitureModel;
import java.util.ArrayList;
import java.util.List;


public class HallwayFragment extends Fragment {
    private FragmentHallwayBinding binding;
    List<FurnitureModel> list_hallway = new ArrayList<>();
    MAdapter adapter;
    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHallwayBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_hallway);
        binding.rvHallway.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_hallway.add(new FurnitureModel("hallway", "Вешалка Монмарт-3 White", "3990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "116 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "28 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "42 см\n" +
                        "Материал корпуса: ЛДСП 16 мм\n" +
                        "Вариант доставки: в разобранном виде\n" +
                        "Цвет корпуса:Белая Шагрень", R.drawable.hallway));
        list_hallway.add(new FurnitureModel("kitchen", " Зеркало настенное Асмунд Wood", "9990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "50 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "165 см\n" +
                        "Материал рамы: дерево\n" +
                        "Материал задней стенки: МДФ\n" +
                        "Цвет рамы:Натуральное дерево"
                , R.drawable.hallway1));
        list_hallway.add(new FurnitureModel("hallway", "Зеркало настенное Сильван Black", "8990руб.\n" ,
                "Характеристики\n" +
                        "Размеры\n" +
                        "Длина\n" +
                        "50 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "120 см\n" +
                        "Материал рамы: металл\n" +
                        "Материал задней стенки: бархат\n" +
                        "Цвет рамы:Черный"
                , R.drawable.hallway2));
        list_hallway.add(new FurnitureModel("hallway", "Вешалка Доти Wood", "3990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "60 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "43 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "154 см\n" +
                        "Материал корпуса: бамбук\n" +
                        "Подпятники: без подпятников\n" +
                        "Просвет от пола: 9 см\n" +
                        "Цвет корпуса:Натуральный"
                , R.drawable.hallway3));
        list_hallway.add(new FurnitureModel("hallway", "Прихожая Равенна Plain\n", "34 490руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "121 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "45 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "195 см.Материал корпуса: ЛДСП 16 мм\n" +
                        "Цвет фасада:Белый Матовый\n" +
                        "Цвет корпуса:Белая Шагрень\n" +
                        "Цвет корпуса 2:Дуб золотистый\n" +
                        "Цвет задней стенки:Белый ЛХДФ", R.drawable.hallway4));
        list_hallway.add(new FurnitureModel("hallway", "Шкаф-купе Орлеан-2-140-240", "36 990руб.\n" ,
                "Шкаф-купе «Орлеан» – это вместительная система для хранения одежды, обуви, предметов гардероба и других, самых разных вещей. Массивное основание с текстурой дерева и большие зеркальные фасады станут прекрасным дополнением любого интерьера. За дверцами вас ждет продуманное внутреннее наполнение: глубокие полки и отдельный отсек со штангой для вешалок.\n" +
                        "\n"+"Размеры\n" +
                        "Длина\n" +
                        "140 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "60 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "240 см\n" +
                        "Выдвижные ящики:нет\n"
                , R.drawable.hallway5));
        list_hallway.add(new FurnitureModel("hallway", "Шкаф-купе Итан-3-180-230 Белый", "44 990руб.\n" ,
                "«Итан-3» – эргономичный и стильный шкаф-купе. Модель доступна в двух размерах и четырех расцветках. Продуманное внутреннее наполнение делает шкаф вместительным, но компактным. Универсальный минималистичный дизайн, строгий силуэт и натуральные текстуры превращают его в базовый элемент стиля модерн, сканди или лофт.\n" +
                        "\n"
                , R.drawable.hallway6));
        list_hallway.add(new FurnitureModel("hallway", "Шкаф-купе Тебар-4", "52 990руб.\n",
                "Четырехдверный шкаф «Тебар» – удобная система для упорядоченного хранения одежды. Благодаря солидным габаритам и повышенной вместимости, он без труда вместит гардероб большой семьи. В конструкции шкафа предусмотрены полки и штанги, а фасад украшает большое зеркало, в котором можно рассмотреть себя в полный рост. За дверцами вас ждет продуманное внутреннее наполнение. А наличие ленты-щетки предотвратит попадание пыли внутрь шкафа и обеспечит бесшумное открывание и закрывание створок (данный элемент в базовую комплектацию изделия не входит и приобретается отдельно).\n" +
                        "\n"
                , R.drawable.hallway7));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_hallwayFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}