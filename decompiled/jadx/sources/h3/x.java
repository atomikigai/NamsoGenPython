package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f4888f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f4889g0;

    public static int b0(int[] iArr, int i) {
        int i10 = i - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (i - i12) * iArr[i12];
        }
        int i13 = (i11 * 10) % 11;
        if (i13 == 10 || i13 == 11) {
            return 0;
        }
        return i13;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_generate_cpf, viewGroup, false);
        this.f4888f0 = (TextView) viewInflate.findViewById(R.id.resultTextView);
        Button button = (Button) viewInflate.findViewById(R.id.generateButton);
        this.f4889g0 = (Button) viewInflate.findViewById(R.id.copyButton);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f4882b;

            {
                this.f4882b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        Random random = new Random();
                        int[] iArr = new int[9];
                        for (int i10 = 0; i10 < 9; i10++) {
                            iArr[i10] = random.nextInt(10);
                        }
                        ArrayList arrayListU = vb.h.U(iArr);
                        arrayListU.add(Integer.valueOf(x.b0(vb.i.m0(arrayListU), 10)));
                        arrayListU.add(Integer.valueOf(x.b0(vb.i.m0(arrayListU), 11)));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(((Number) arrayListU.get(0)).intValue());
                        sb2.append(((Number) arrayListU.get(1)).intValue());
                        sb2.append(((Number) arrayListU.get(2)).intValue());
                        sb2.append('.');
                        sb2.append(((Number) arrayListU.get(3)).intValue());
                        sb2.append(((Number) arrayListU.get(4)).intValue());
                        sb2.append(((Number) arrayListU.get(5)).intValue());
                        sb2.append('.');
                        sb2.append(((Number) arrayListU.get(6)).intValue());
                        sb2.append(((Number) arrayListU.get(7)).intValue());
                        sb2.append(((Number) arrayListU.get(8)).intValue());
                        sb2.append('-');
                        sb2.append(((Number) arrayListU.get(9)).intValue());
                        sb2.append(((Number) arrayListU.get(10)).intValue());
                        String string = sb2.toString();
                        String strC0 = pc.o.c0(pc.o.c0(string, ".", ""), "-", "");
                        int length = strC0.length();
                        x xVar = this.f4882b;
                        if (length == 11) {
                            ArrayList arrayList = new ArrayList(strC0.length());
                            for (int i11 = 0; i11 < strC0.length(); i11++) {
                                arrayList.add(Integer.valueOf(Integer.parseInt(String.valueOf(strC0.charAt(i11)))));
                            }
                            int[] iArrM0 = vb.i.m0(arrayList);
                            int iB0 = x.b0(iArrM0, 10);
                            int iB1 = x.b0(iArrM0, 11);
                            if (iB0 == iArrM0[9] && iB1 == iArrM0[10]) {
                                TextView textView = xVar.f4888f0;
                                if (textView == null) {
                                    jc.i.i("resultTextView");
                                    throw null;
                                }
                                textView.setText(string);
                                Button button2 = xVar.f4889g0;
                                if (button2 == null) {
                                    jc.i.i("copyButton");
                                    throw null;
                                }
                                button2.setVisibility(0);
                                androidx.fragment.app.w wVarT = xVar.T();
                                MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                                if (mainActivity != null) {
                                    mainActivity.z();
                                    return;
                                }
                                return;
                            }
                        }
                        TextView textView2 = xVar.f4888f0;
                        if (textView2 == null) {
                            jc.i.i("resultTextView");
                            throw null;
                        }
                        textView2.setText(xVar.v(R.string.error_generate_cpf));
                        Button button3 = xVar.f4889g0;
                        if (button3 != null) {
                            button3.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("copyButton");
                            throw null;
                        }
                    default:
                        x xVar2 = this.f4882b;
                        TextView textView3 = xVar2.f4888f0;
                        if (textView3 == null) {
                            jc.i.i("resultTextView");
                            throw null;
                        }
                        String strX0 = pc.g.x0(textView3.getText().toString(), ": ");
                        androidx.fragment.app.w wVarG = xVar2.g();
                        Object systemService = wVarG != null ? wVarG.getSystemService("clipboard") : null;
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(xVar2.v(R.string.clipboard_cpf), strX0));
                        Toast.makeText(xVar2.U(), xVar2.v(R.string.cpf_copied), 0).show();
                        return;
                }
            }
        });
        Button button2 = this.f4889g0;
        if (button2 == null) {
            jc.i.i("copyButton");
            throw null;
        }
        final int i10 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f4882b;

            {
                this.f4882b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        Random random = new Random();
                        int[] iArr = new int[9];
                        for (int i11 = 0; i11 < 9; i11++) {
                            iArr[i11] = random.nextInt(10);
                        }
                        ArrayList arrayListU = vb.h.U(iArr);
                        arrayListU.add(Integer.valueOf(x.b0(vb.i.m0(arrayListU), 10)));
                        arrayListU.add(Integer.valueOf(x.b0(vb.i.m0(arrayListU), 11)));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(((Number) arrayListU.get(0)).intValue());
                        sb2.append(((Number) arrayListU.get(1)).intValue());
                        sb2.append(((Number) arrayListU.get(2)).intValue());
                        sb2.append('.');
                        sb2.append(((Number) arrayListU.get(3)).intValue());
                        sb2.append(((Number) arrayListU.get(4)).intValue());
                        sb2.append(((Number) arrayListU.get(5)).intValue());
                        sb2.append('.');
                        sb2.append(((Number) arrayListU.get(6)).intValue());
                        sb2.append(((Number) arrayListU.get(7)).intValue());
                        sb2.append(((Number) arrayListU.get(8)).intValue());
                        sb2.append('-');
                        sb2.append(((Number) arrayListU.get(9)).intValue());
                        sb2.append(((Number) arrayListU.get(10)).intValue());
                        String string = sb2.toString();
                        String strC0 = pc.o.c0(pc.o.c0(string, ".", ""), "-", "");
                        int length = strC0.length();
                        x xVar = this.f4882b;
                        if (length == 11) {
                            ArrayList arrayList = new ArrayList(strC0.length());
                            for (int i12 = 0; i12 < strC0.length(); i12++) {
                                arrayList.add(Integer.valueOf(Integer.parseInt(String.valueOf(strC0.charAt(i12)))));
                            }
                            int[] iArrM0 = vb.i.m0(arrayList);
                            int iB0 = x.b0(iArrM0, 10);
                            int iB1 = x.b0(iArrM0, 11);
                            if (iB0 == iArrM0[9] && iB1 == iArrM0[10]) {
                                TextView textView = xVar.f4888f0;
                                if (textView == null) {
                                    jc.i.i("resultTextView");
                                    throw null;
                                }
                                textView.setText(string);
                                Button button3 = xVar.f4889g0;
                                if (button3 == null) {
                                    jc.i.i("copyButton");
                                    throw null;
                                }
                                button3.setVisibility(0);
                                androidx.fragment.app.w wVarT = xVar.T();
                                MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                                if (mainActivity != null) {
                                    mainActivity.z();
                                    return;
                                }
                                return;
                            }
                        }
                        TextView textView2 = xVar.f4888f0;
                        if (textView2 == null) {
                            jc.i.i("resultTextView");
                            throw null;
                        }
                        textView2.setText(xVar.v(R.string.error_generate_cpf));
                        Button button4 = xVar.f4889g0;
                        if (button4 != null) {
                            button4.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("copyButton");
                            throw null;
                        }
                    default:
                        x xVar2 = this.f4882b;
                        TextView textView3 = xVar2.f4888f0;
                        if (textView3 == null) {
                            jc.i.i("resultTextView");
                            throw null;
                        }
                        String strX0 = pc.g.x0(textView3.getText().toString(), ": ");
                        androidx.fragment.app.w wVarG = xVar2.g();
                        Object systemService = wVarG != null ? wVarG.getSystemService("clipboard") : null;
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(xVar2.v(R.string.clipboard_cpf), strX0));
                        Toast.makeText(xVar2.U(), xVar2.v(R.string.cpf_copied), 0).show();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
