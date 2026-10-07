package ea;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d4.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import k.m;
import o3.t;
import o3.u;
import r0.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements i4.a, i6.f, x, zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3530b;

    public /* synthetic */ j(int i, Object obj) {
        this.f3529a = i;
        this.f3530b = obj;
    }

    public g.f a() {
        g.b bVar = (g.b) this.f3530b;
        g.f fVar = new g.f(bVar.f3968a, this.f3529a);
        View view = bVar.e;
        g.e eVar = fVar.f4019f;
        if (view != null) {
            eVar.f4012w = view;
        } else {
            CharSequence charSequence = bVar.f3971d;
            if (charSequence != null) {
                eVar.f3996d = charSequence;
                TextView textView = eVar.f4010u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f3970c;
            if (drawable != null) {
                eVar.f4008s = drawable;
                ImageView imageView = eVar.f4009t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f4009t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f3972f;
        if (charSequence2 != null) {
            eVar.e = charSequence2;
            TextView textView2 = eVar.f4011v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = bVar.f3973g;
        if (charSequence3 != null) {
            eVar.c(-1, charSequence3, bVar.h);
        }
        CharSequence charSequence4 = bVar.i;
        if (charSequence4 != null) {
            eVar.c(-2, charSequence4, bVar.f3974j);
        }
        CharSequence charSequence5 = bVar.f3975k;
        if (charSequence5 != null) {
            eVar.c(-3, charSequence5, bVar.f3976l);
        }
        if (bVar.f3980p != null || bVar.f3981q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f3969b.inflate(eVar.A, (ViewGroup) null);
            int i = bVar.f3984t ? eVar.B : eVar.C;
            ListAdapter dVar = bVar.f3981q;
            if (dVar == null) {
                dVar = new g.d(bVar.f3968a, i, R.id.text1, bVar.f3980p);
            }
            eVar.f4013x = dVar;
            eVar.f4014y = bVar.f3985u;
            if (bVar.f3982r != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f3984t) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f3997f = alertController$RecycleListView;
        }
        View view2 = bVar.f3983s;
        if (view2 != null) {
            eVar.f3998g = view2;
            eVar.h = false;
        }
        fVar.setCancelable(bVar.f3977m);
        if (bVar.f3977m) {
            fVar.setCanceledOnTouchOutside(true);
        }
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(bVar.f3978n);
        m mVar = bVar.f3979o;
        if (mVar != null) {
            fVar.setOnKeyListener(mVar);
        }
        return fVar;
    }

    @Override // i6.f
    public void b(JsonWriter jsonWriter) throws IOException {
        int i = this.f3529a;
        Map map = (Map) this.f3530b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        i6.g.e(jsonWriter, map);
        jsonWriter.endObject();
    }

    @Override // r0.x
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f3530b).B(this.f3529a);
        return true;
    }

    public boolean d() {
        return this.f3529a < ((ArrayList) this.f3530b).size();
    }

    @Override // i4.a
    public w3.x e(w3.x xVar, u3.i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) xVar.get()).compress((Bitmap.CompressFormat) this.f3530b, this.f3529a, byteArrayOutputStream);
        xVar.b();
        return new z(byteArrayOutputStream.toByteArray());
    }

    public j f(int i) {
        g.b bVar = (g.b) this.f3530b;
        bVar.f3972f = bVar.f3968a.getText(i);
        return this;
    }

    public j g(int i, DialogInterface.OnClickListener onClickListener) {
        g.b bVar = (g.b) this.f3530b;
        bVar.i = bVar.f3968a.getText(i);
        bVar.f3974j = onClickListener;
        return this;
    }

    public j h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g.b bVar = (g.b) this.f3530b;
        bVar.i = charSequence;
        bVar.f3974j = onClickListener;
        return this;
    }

    public j i(int i, DialogInterface.OnClickListener onClickListener) {
        g.b bVar = (g.b) this.f3530b;
        bVar.f3975k = bVar.f3968a.getText(i);
        bVar.f3976l = onClickListener;
        return this;
    }

    public j j(int i, DialogInterface.OnClickListener onClickListener) {
        g.b bVar = (g.b) this.f3530b;
        bVar.f3973g = bVar.f3968a.getText(i);
        bVar.h = onClickListener;
        return this;
    }

    public j k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g.b bVar = (g.b) this.f3530b;
        bVar.f3973g = charSequence;
        bVar.h = onClickListener;
        return this;
    }

    public j l(int i) {
        g.b bVar = (g.b) this.f3530b;
        bVar.f3971d = bVar.f3968a.getText(i);
        return this;
    }

    public g.f m() {
        g.f fVarA = a();
        fVarA.show();
        return fVarA;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public Object zza(zzp zzpVar) {
        String str;
        u uVar = (u) this.f3530b;
        int i = this.f3529a;
        try {
            if (uVar.E == null) {
                throw null;
            }
            zzau zzauVar = uVar.E;
            String packageName = uVar.C.getPackageName();
            if (i == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i == 4) {
                str = "CONSUME_ASYNC";
            } else if (i != 5) {
                str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzauVar.zza(packageName, str, new t(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            uVar.c0(28, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, o3.x.f7545r);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public /* synthetic */ j(Object obj, int i) {
        this.f3530b = obj;
        this.f3529a = i;
    }

    public j() {
        this.f3530b = Bitmap.CompressFormat.JPEG;
        this.f3529a = 100;
    }

    public j(ArrayList arrayList) {
        this.f3530b = arrayList;
    }

    public j(Context context) {
        this(context, g.f.e(context, 0));
    }

    public j(Context context, int i) {
        this.f3530b = new g.b(new ContextThemeWrapper(context, g.f.e(context, i)));
        this.f3529a = i;
    }
}
