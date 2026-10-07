package w4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class i extends u4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f9611g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f9612h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public EditText f9613i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public TextInputLayout f9614j0;
    public c5.b k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public e5.f f9615l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public h f9616m0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_check_email_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        this.f9611g0 = (Button) view.findViewById(R.id.button_next);
        this.f9612h0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f9611g0.setOnClickListener(this);
        this.f9614j0 = (TextInputLayout) view.findViewById(R.id.email_layout);
        this.f9613i0 = (EditText) view.findViewById(R.id.email);
        this.k0 = new c5.b(this.f9614j0);
        this.f9614j0.setOnClickListener(this);
        this.f9613i0.setOnClickListener(this);
        g().setTitle(R.string.fui_email_link_confirm_email_header);
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    @Override // u4.g
    public final void b() {
        this.f9611g0.setEnabled(true);
        this.f9612h0.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.f9611g0.setEnabled(false);
        this.f9612h0.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.button_next) {
            if (id2 == R.id.email_layout || id2 == R.id.email) {
                this.f9614j0.setError(null);
                return;
            }
            return;
        }
        String string = this.f9613i0.getText().toString();
        if (this.k0.k(string)) {
            e5.f fVar = this.f9615l0;
            fVar.f(s4.h.b());
            fVar.i(string, null);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        androidx.lifecycle.h hVarG = g();
        if (!(hVarG instanceof h)) {
            throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
        }
        this.f9616m0 = (h) hVarG;
        e5.f fVar = (e5.f) new a2.l(this).q(e5.f.class);
        this.f9615l0 = fVar;
        fVar.d(this.f8855f0.w());
        this.f9615l0.f2917g.d(x(), new r4.j(this, this, 4));
    }
}
