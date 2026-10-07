package y4;

import a2.l;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.phone.SpacedEditText;
import e0.k;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class g extends u4.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public d f10575i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f10576j0;
    public ProgressBar k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f10577l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public TextView f10578m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextView f10579n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SpacedEditText f10580o0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f10582q0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Handler f10573g0 = new Handler();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final androidx.activity.d f10574h0 = new androidx.activity.d(this, 20);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f10581p0 = 60000;

    @Override // u4.b, androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        this.f10575i0 = (d) new l(T()).q(d.class);
        this.f10576j0 = this.f977f.getString("extra_phone_number");
        if (bundle != null) {
            this.f10581p0 = bundle.getLong("millis_until_finished");
        }
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_confirmation_code_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void E() {
        this.N = true;
        this.f10573g0.removeCallbacks(this.f10574h0);
    }

    @Override // androidx.fragment.app.s
    public final void I() {
        CharSequence text;
        this.N = true;
        if (!this.f10582q0) {
            this.f10582q0 = true;
            return;
        }
        ClipData primaryClip = ((ClipboardManager) k.getSystemService(U(), ClipboardManager.class)).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() == 1 && (text = primaryClip.getItemAt(0).getText()) != null && text.length() == 6) {
            try {
                Integer.parseInt(text.toString());
                this.f10580o0.setText(text);
            } catch (NumberFormatException unused) {
            }
        }
        Handler handler = this.f10573g0;
        androidx.activity.d dVar = this.f10574h0;
        handler.removeCallbacks(dVar);
        handler.postDelayed(dVar, 500L);
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        this.f10573g0.removeCallbacks(this.f10574h0);
        bundle.putLong("millis_until_finished", this.f10581p0);
    }

    @Override // androidx.fragment.app.s
    public final void K() {
        this.N = true;
        this.f10580o0.requestFocus();
        ((InputMethodManager) T().getSystemService("input_method")).showSoftInput(this.f10580o0, 0);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        this.k0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f10577l0 = (TextView) view.findViewById(R.id.edit_phone_number);
        this.f10579n0 = (TextView) view.findViewById(R.id.ticker);
        this.f10578m0 = (TextView) view.findViewById(R.id.resend_code);
        this.f10580o0 = (SpacedEditText) view.findViewById(R.id.confirmation_code);
        T().setTitle(v(R.string.fui_verify_your_phone_title));
        b0();
        this.f10580o0.setText("------");
        SpacedEditText spacedEditText = this.f10580o0;
        spacedEditText.addTextChangedListener(new b5.a(spacedEditText, new v1.d(this)));
        this.f10577l0.setText(this.f10576j0);
        final int i = 1;
        this.f10577l0.setOnClickListener(new View.OnClickListener(this) { // from class: y4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f10572b;

            {
                this.f10572b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        g gVar = this.f10572b;
                        gVar.f10575i0.g(gVar.T(), gVar.f10576j0, true);
                        gVar.f10578m0.setVisibility(8);
                        gVar.f10579n0.setVisibility(0);
                        gVar.f10579n0.setText(String.format(gVar.v(R.string.fui_resend_code_in), 60L));
                        gVar.f10581p0 = 60000L;
                        gVar.f10573g0.postDelayed(gVar.f10574h0, 500L);
                        break;
                    default:
                        this.f10572b.T().p().K();
                        break;
                }
            }
        });
        final int i10 = 0;
        this.f10578m0.setOnClickListener(new View.OnClickListener(this) { // from class: y4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f10572b;

            {
                this.f10572b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        g gVar = this.f10572b;
                        gVar.f10575i0.g(gVar.T(), gVar.f10576j0, true);
                        gVar.f10578m0.setVisibility(8);
                        gVar.f10579n0.setVisibility(0);
                        gVar.f10579n0.setText(String.format(gVar.v(R.string.fui_resend_code_in), 60L));
                        gVar.f10581p0 = 60000L;
                        gVar.f10573g0.postDelayed(gVar.f10574h0, 500L);
                        break;
                    default:
                        this.f10572b.T().p().K();
                        break;
                }
            }
        });
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    @Override // u4.g
    public final void b() {
        this.k0.setVisibility(4);
    }

    public final void b0() {
        long j4 = this.f10581p0 - 500;
        this.f10581p0 = j4;
        if (j4 > 0) {
            this.f10579n0.setText(String.format(v(R.string.fui_resend_code_in), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f10581p0) + 1)));
            this.f10573g0.postDelayed(this.f10574h0, 500L);
        } else {
            this.f10579n0.setText("");
            this.f10579n0.setVisibility(8);
            this.f10578m0.setVisibility(0);
        }
    }

    @Override // u4.g
    public final void i(int i) {
        this.k0.setVisibility(0);
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        ((g5.a) new l(T()).q(g5.a.class)).f2917g.d(x(), new t4.f(this));
    }
}
