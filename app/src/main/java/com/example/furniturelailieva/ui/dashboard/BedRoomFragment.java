package com.example.furniturelailieva.ui.dashboard;

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
import com.example.furniturelailieva.models.FurnitureModel;
import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Кевия 140 Bucle", "62 990руб.",
                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
                        " Материал корпуса: ДВП, ткань, фанера, ДСП\n" +
                        "Материал изголовья: ткань, мебельный щит\n" +
                        "Материал опор: пластик", R.drawable.bed));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Шерона 160 Velvet Terra", "36 990руб.",
                " производство Италия, размер 2.6м х 2.4м" + " Кровать «Шерона» выполнена в традиционном европейском стиле, требовательном к эстетичности облика и практичности конструкции. Правильные прямоугольные формы, приятная на ощупь и красивая на вид фактура обивки, лаконичная отделка строчкой – это универсальная модель, которая не выходит из моды!"
                , R.drawable.bed1));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Дарти 140 Wood", "25 990руб.",
                "Размеры\n" +
                        "Длина\n" +
                        "209 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "148 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "100 см\n" +
                        "Спальное место:200 x 140\n"+"Материал корпуса: массив березы, фанера\n" +
                        "Материал изголовья: массив березы,Цвет: бежевый\n" +
                        "Материал опор: массив березы"
                , R.drawable.bed2));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Раверти-Legs 160", "37 990руб.\n",

                        "Основание кровати: ортопедическое основание\n" +
                                "Максимальная нагрузка на одно спальное место: 120 кг,Размеры\n" +
                                "Длина\n" +
                                "212 см\n" +
                                "х\n" +
                                "Ширина\n" +
                                "171 см\n" +
                                "х\n" +
                                "Высота\n" +
                                "121 см,Ткань 1:Gesta Night велюр"
                , R.drawable.bed3));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Леос 160 White", "27 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "210 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "170 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "94 см" +
                        " Материал корпуса: массив березы, фанера\n" +
                        "Материал изголовья: массив березы\n" +
                        "Материал опор: массив березы\n" +
                        "Подъемный механизм: без механизма\n" +
                        "Основание кровати: реечное деревянное\n" +
                        "Цвет корпуса:Белый", R.drawable.bed4));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Даймант-Floor 160", "47 990руб.\n",
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
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Клифтон Velvet Plum", "53 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "245 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "248 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "91 см" +
                        "Основание кровати: ортопедическое основание\n,Материал корпуса: МДФ 16 мм, ДВП, ткань, ДСП, мебельный щит\n" +
                        "Материал изголовья: ткань, мебельный щит\n,Ткань 1:Ultra Plum велюр"
                , R.drawable.bed6));
        list_bedroom.add(new FurnitureModel("bed_room","Кровать Стелла 140 Дуб Сонома", "25 990руб.\n" ,
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
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}