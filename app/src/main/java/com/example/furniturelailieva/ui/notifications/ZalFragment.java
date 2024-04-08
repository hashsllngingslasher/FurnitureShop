package com.example.furniturelailieva.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import com.example.furniturelailieva.MAdapter;
import com.example.furniturelailieva.R;
import com.example.furniturelailieva.databinding.FragmentZalBinding;
import com.example.furniturelailieva.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("zal","Лофт Velvet Grey", "28200.руб",
                " Механизм трансформации: еврокнижка" + " Каркас: массив, мебельный щит " + "Наполнение приспинных подушек: холлофайбер" +
                        "Ткань 1:Maxx 900 велюр", R.drawable.divan1));
        list_zal.add(new FurnitureModel("zal","Диван Flow" ,
                "28600.руб", "Диван двухстворчатый раскладной" +
                " производство Германия, матрас набивной пружинный, кокосовая стружка", R.drawable.sofa_blu_charm));
        list_zal.add(new FurnitureModel("zal","Диван FOMARA" ,
                "12640.руб", "Диван двухстворчатый раскладной" +
                " Производитель: Турция,Один из выдающихся примеров честерского стиля, который выделяется своим стеганым мастерством.Он фокусируется на комфорте и функциональности благодаря своим трехместным, двухместным модулям, модулям кресла и возможности использования в качестве кровати.", R.drawable.divan2));
        list_zal.add(new FurnitureModel("zal","Диван Бонент Velvet Eclipse" ,
                "16200.руб", "Высота подлокотников от пола: 62 см\n" +
                "Каркас: массив, фанера, ДВП, ДСП, пружинная змейка\n" +
                "Наполнение посадочного места: ППУ Elax Medium, ППУ ST стандартный" , R.drawable.divan4));
        list_zal.add(new FurnitureModel("zal","Диван Эби Happy Emerald" ,
                "25680.руб", "Лаконичный дизайн дивана Эби подойдет для создания интерьера в стиле лофт. Акцентная окантовка подчеркивает геометрию форм и присущую стилю строгость. Лишних деталей нет – все функционально. Конструктор на сайте позволяет подчеркнуть индивидуальность: усилить брутальность интерьера или придать лофту мягкости. А глубина дивана и продуманное сочетание наполнителей обещают приятный отдых.", R.drawable.divan3));
        list_zal.add(new FurnitureModel("zal","Диван Льери Barhat Mint" ,
                "12450.руб", "Диван «Льери» – новый тренд в скандинавском дизайне с идеальной эргономикой и удобным раскладным механизмом. Строгий силуэт и точеные линии делают модель уместной как в офисном лобби, так и в домашней гостиной." +
                " Каркас: массив, фанера, ДВП, ДСП, пружинная змейка\n" +
                "Наполнение посадочного места: ППУ Elax Medium, независимый пружинный блок\n" +
                "Наполнение приспинных подушек: формованный ППУ", R.drawable.divan));
        list_zal.add(new FurnitureModel("zal","Диван Рон Textile Plum" ,
                "32560.руб", "Размеры\n" +
                "Длина\n" +
                "223 см\n" +
                "х\n" +
                "Ширина\n" +
                "102 см\n" +
                "х\n" +
                "Высота\n" +
                "85 см\n" +
                "Посадочное место\n" +
                "Длина\n" +
                "160 см\n" +
                "х\n" +
                "Глубина\n" +
                "65 см\n" +
                "х\n" +
                "Высота\n" +
                "46 см\n" +
                "Высота подлокотников от пола: 55 см\n" +
                "Каркас: фанера, ДВП, ДСП\n" +
                "Наполнение приспинных подушек: крошка ППУ, синтепух\n" +
                "Наполнение посадочного места: ППУ ST стандартный, независимый пружинный блок\n" +
                "Материал опор: металл\n", R.drawable.divan5));
        list_zal.add(new FurnitureModel("zal","Диван Лачи Velvet Pink" ,
                "85960.руб", "Механизм трансформации: еврокнижка\n" +
                "Бельевой ящик: да\n" +
                "Съемный чехол: нет\n" +
                "Подушки декоративные: без подушек" +
                " Каркас: массив, фанера, ДВП, ДСП, мебельный щит\n" +
                "Наполнение посадочного места: независимый пружинный блок\n" +
                "Наполнение приспинных подушек: крошка ППУ", R.drawable.divan6));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_zal_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}