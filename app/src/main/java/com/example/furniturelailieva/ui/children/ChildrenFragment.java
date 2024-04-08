package com.example.furniturelailieva.ui.children;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.furniturelailieva.MAdapter;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentChildrenBinding;
import com.example.furniturelailieva.models.FurnitureModel;
import java.util.ArrayList;
import java.util.List;


public class ChildrenFragment extends Fragment {
    private FragmentChildrenBinding binding;
    List<FurnitureModel> list_children = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentChildrenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_children);
        binding.rvChildren.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_children.add(new FurnitureModel("children","Распашной шкаф Стелла", "22 990руб.\n" ,
                "Вместительность, функциональность и простота воплощены в модели распашного шкафа «Стелла». Продуманная конструкция и организация внутреннего пространства позволяют разместить все необходимое и увеличить полезную площадь помещения.Размеры\n" +
                        "Длина\n" +
                        "130 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "50 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "200 см", R.drawable.child));
        list_children.add(new FurnitureModel("children","Распашной шкаф Тайрон-2 Savage", "36 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "95 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "50 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "200 см" + "Материал корпуса: ЛДСП 16 мм\n" +
                        "Материал фасада: ЛДСП 16 мм\n" +
                        "Ручки: Этель Iron\n" +
                        "Материал ручек: металл\n" +
                        "Материал опор: сращенный массив\n" +
                        "Регулировка опор: нет\n" +
                        "Цвет корпуса:Дуб Золотистый\n" +
                        "Цвет фасада:Белая шагрень\n" +
                        "Цвет фасада 2:Дуб Золотистый\n" +
                        "Цвет задней стенки:Дуб Крафт золотой ЛХДФ"
                , R.drawable.child1));
        list_children.add(new FurnitureModel("children","Распашной шкаф Тайрон-2 Fable\n", "36 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "95 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "50 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "200 см,Материал корпуса: ЛДСП 16 мм\n" +
                        "Материал фасада: ЛДСП 16 мм\n" +
                        "Ручки: Этель Iron\n" +
                        "Материал ручек: металл\n" +
                        "Материал опор: сращенный массив\n" +
                        "Регулировка опор: нет\n" +
                        "Цвет корпуса:Дуб Золотистый\n" +
                        "Цвет фасада:Белая шагрень\n" +
                        "Цвет фасада 2:Дуб Золотистый\n" +
                        "Цвет задней стенки:Дуб Крафт золотой ЛХДФ"
                , R.drawable.child2));
        list_children.add(new FurnitureModel("children","Распашной шкаф Арчи-2 Rose Irish", "36 490руб.\n" ,

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
        list_children.add(new FurnitureModel("children","Кровать Рунда 90 Barhat Light Pink", "22 990руб.\n" ,
                "Размеры\n" +
                        "Длина\n" +
                        "217 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "105 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "121 см,Материал корпуса: ДВП, ткань, фанера, ДСП\n" +
                        "Материал изголовья: ткань, мебельный щит\n" +
                        "Основание кровати: ортопедическое основание\n" +
                        "Подъемный механизм: без механизма\n" +
                        "Матрас в комплекте: без матраса\n" +
                        "Подпятники: пластиковые\n" +
                        "Ткань 1:Gesta Light велюр\n" +
                        "Ткань 2:Gesta Pink велюр\n" +
                        "Ткань 3:Gesta Coral велюр", R.drawable.child4));
        list_children.add(new FurnitureModel("children","Кровать Даймант-Floor 160", "47 990руб.\n",
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
        list_children.add(new FurnitureModel("children","Кровать Руффи-1 Wood", "24 990руб.\n",
                "Размеры\n" +
                        "Длина\n" +
                        "172 см\n" +
                        "х\n" +
                        "Ширина\n" +
                        "93 см\n" +
                        "х\n" +
                        "Высота\n" +
                        "164 см,Материал корпуса: массив березы\n" +
                        "Материал опор: сращенный массив\n" +
                        "Основание кровати: реечное деревянное\n" +
                        "Подъемный механизм: без механизма\n" +
                        "Бельевой ящик: нет\n" +
                        "Матрас в комплекте: без матраса\n" +
                        "Ткань 1:Blury Beige рогожка\n" +
                        "Цвет корпуса:Натуральный\n" +
                        "Опоры:Натуральный"
                , R.drawable.child5));
        list_children.add(new FurnitureModel("children","Детская кровать Обри-1 80 Velvet Violet", "19 990руб.\n",
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

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_childrenFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}